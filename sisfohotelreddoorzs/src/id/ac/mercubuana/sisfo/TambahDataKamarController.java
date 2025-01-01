package id.ac.mercubuana.sisfo;

import java.sql.Date;
import java.util.List;

import org.orm.PersistentException;

import com.mercubuana.sisfohotelreddoorz.Kamar;
import com.mercubuana.sisfohotelreddoorz.Pemesan;
import com.mercubuana.sisfohotelreddoorz.KamarDAO;
import com.mercubuana.sisfohotelreddoorz.PemesanDAO;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class TambahDataKamarController {

    @FXML
    private Button CariDataKamar;

    @FXML
    private Button HapusDataKamar;

    @FXML
    private Spinner<Integer> Kapasitas;

    @FXML
    private TableColumn<Kamar, Integer> KolomKapasitas;

    @FXML
    private TableColumn<Kamar, String> KolomNomorKamar;

    @FXML
    private TableColumn<Kamar, Integer> KolomSisaTempat;

    @FXML
    private TableColumn<Kamar, Character> KolomTipeKamar;

    @FXML
    private TextField NamaPemesan;

    @FXML
    private TextField NomorKamar;

    @FXML
    private TextField NomorPilih;

    @FXML
    private Button SimpanDataKamar;

    @FXML
    private Button SimpanPemesanan;

    @FXML
    private Spinner<Integer> SisaTempat;

    @FXML
    private TableView<Kamar> TableDataKamar;

    @FXML
    private Button TambahDataKamar;

    @FXML
    private ChoiceBox<Character> TipeKamar;
    
    @FXML
    private ChoiceBox<Character> TipeKamarPemesan;

    @FXML
    private Button UbahDataKamar;
    
    @FXML
    private TabPane tabPane;

    @FXML
    private Tab tabDataKamar;

    @FXML
    private Tab tabDataPemesanan;
    

    public void initialize() {
        // Inisialisasi TableColumn
        KolomNomorKamar.setCellValueFactory(new PropertyValueFactory<>("nomor_kamar"));
        KolomKapasitas.setCellValueFactory(new PropertyValueFactory<>("kapasitas"));
        KolomSisaTempat.setCellValueFactory(new PropertyValueFactory<>("sisa_kamar"));
        KolomTipeKamar.setCellValueFactory(new PropertyValueFactory<>("tipe_kamar"));

        // Spinner
        Kapasitas.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1));
        SisaTempat.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0));

        // ChoiceBox
        TipeKamar.getItems().addAll('P', 'B');
        TipeKamarPemesan.getItems().addAll('P', 'B');
        TipeKamar.getSelectionModel().selectFirst();
        TipeKamarPemesan.getSelectionModel().selectFirst();

        // Pastikan TextField tidak dinonaktifkan
        NomorKamar.setDisable(false);
        NamaPemesan.setDisable(false);
        NomorPilih.setDisable(false);

        // Load data ke tabel
        loadDataKamar();
        
        tabPane.getSelectionModel().selectedItemProperty().addListener((obs, oldTab, newTab) -> {
            if (newTab == tabDataKamar) {
                System.out.println("Tab DataKamar aktif");
                NomorKamar.requestFocus();
            } else if (newTab == tabDataPemesanan) {
                System.out.println("Tab DataPemesanan aktif");
                NomorPilih.requestFocus();
            }
        });
    }


    private void loadDataKamar() {
        try {
            List<Kamar> daftarKamar = KamarDAO.queryKamar(null, "id");
            if (daftarKamar.isEmpty()) {
                TableDataKamar.setPlaceholder(new Label("Belum ada data kamar"));
            } else {
                TableDataKamar.getItems().setAll(daftarKamar);
            }
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleCariDataKamar(MouseEvent event) {
        if (TipeKamar.getValue() == null) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Pencarian Tipe Kamar");
            alert.setHeaderText(null);
            alert.setContentText("Silakan pilih tipe kamar terlebih dahulu.");
            alert.showAndWait();
            return;
        }

        Character tipeKamar = TipeKamar.getValue();
        System.out.println("Tipe kamar yang dipilih: " + tipeKamar); 

        try {
            // Query data kamar berdasarkan tipe kamar
        	List<Kamar> kamarDicari = KamarDAO.queryKamar("UPPER(tipe_kamar) = UPPER('" + tipeKamar + "')", null);
        	System.out.println("Query: tipe_kamar='" + tipeKamar + "'");
        	System.out.println("Jumlah kamar ditemukan: " + kamarDicari.size());
            if (kamarDicari.isEmpty()) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Pencarian Data Kamar");
                alert.setHeaderText(null);
                alert.setContentText("Tidak ditemukan kamar dengan tipe " + tipeKamar + ".");
                alert.showAndWait();
            } else {
                // Menampilkan detail data kamar
                StringBuilder detailKamar = new StringBuilder();
                for (Kamar kamar : kamarDicari) {
                    detailKamar.append("Nomor Kamar: ").append(kamar.getNomor_kamar()).append("\n")
                               .append("Kapasitas: ").append(kamar.getKapasitas()).append("\n")
                               .append("Sisa Tempat: ").append(kamar.getSisa_kamar()).append("\n")
                               .append("Tipe Kamar: ").append(kamar.getTipe_kamar()).append("\n\n");
                }

                // Menampilkan data di dalam Alert
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Data Kamar Ditemukan");
                alert.setHeaderText("Kamar dengan tipe " + tipeKamar + ":");
                alert.setContentText(detailKamar.toString());
                alert.showAndWait();

                // Atau menampilkan data ke TableView
                TableDataKamar.getItems().setAll(kamarDicari);
            }
        } catch (PersistentException e) {
            e.printStackTrace();
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Kesalahan");
            alert.setHeaderText(null);
            alert.setContentText("Terjadi kesalahan saat mencari data kamar: " + e.getMessage());
            alert.showAndWait();
        }
    }
    
    @FXML
    void handleSimpanPemesanan(MouseEvent event) {
        try {
            // Validasi input
            if (NamaPemesan.getText() == null || NamaPemesan.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("Nama pemesan tidak boleh kosong!");
            }
            if (TipeKamarPemesan.getValue() == null) {
                throw new IllegalArgumentException("Tipe kamar harus dipilih!");
            }

            // Ambil data dari form
            String namaPemesan = NamaPemesan.getText().trim();
            char tipeKamar = TipeKamarPemesan.getValue(); 
            

            List<Kamar> kamarByTipe = KamarDAO.queryKamar("tipe_kamar = '" + tipeKamar + "'", null);
            if (kamarByTipe.isEmpty()) {
                throw new IllegalArgumentException("Tidak ada kamar tersedia untuk tipe kamar: " + tipeKamar);
            }
            

            if (NomorPilih.getText() == null || NomorPilih.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("Nomor kamar harus dipilih berdasarkan tipe kamar!");
            }
            String nomorKamar = NomorPilih.getText().trim();


            List<Kamar> daftarKamar = KamarDAO.queryKamar(
                "nomor_kamar = '" + nomorKamar + "' AND tipe_kamar = '" + tipeKamar + "'", null
            );
            if (daftarKamar.isEmpty()) {
                throw new IllegalArgumentException("Kamar dengan nomor " + nomorKamar + " tidak ditemukan untuk tipe " + tipeKamar);
            }


            Kamar kamar = daftarKamar.get(0);

            if (kamar.getSisa_kamar() <= 0) {
                throw new IllegalArgumentException("Kamar dengan nomor " + nomorKamar + " sudah penuh!");
            }

            Pemesan pemesananBaru = new Pemesan();
            pemesananBaru.setNama_pemesan(namaPemesan);
            pemesananBaru.setNomor_kamar(nomorKamar);
            pemesananBaru.setTanggal_pemesanan(new Date(System.currentTimeMillis()));
            pemesananBaru.setTipe_kamar(tipeKamar);
            pemesananBaru.setKamarid_kamar(kamar); // Set objek kamar terkait

            // Simpan data ke database
            PemesanDAO.save(pemesananBaru);

            // Kurangi sisa tempat pada kamar
            kamar.setSisa_kamar(kamar.getSisa_kamar() - 1);
            KamarDAO.save(kamar);

            // Notifikasi sukses
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sukses");
            alert.setHeaderText(null);
            alert.setContentText("Pemesanan berhasil disimpan!");
            alert.showAndWait();

            // Reset form
            NamaPemesan.clear();
            NomorPilih.clear();
            TipeKamarPemesan.setValue(null); // Reset TipeKamarPemesan

            // Refresh tabel data kamar
            loadDataKamar();
        } catch (IllegalArgumentException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Kesalahan");
            alert.setHeaderText(null);
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Kesalahan");
            alert.setHeaderText(null);
            alert.setContentText("Gagal menyimpan pemesanan: " + e.getMessage());
            alert.showAndWait();
        }
    }



    @FXML
    void handleSimpanDataKamar(MouseEvent event) {
        try {

            if (NomorKamar.getText() == null || NomorKamar.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("Nomor kamar tidak boleh kosong!");
            }
            if (TipeKamar.getValue() == null) {
                throw new IllegalArgumentException("Tipe kamar tidak boleh kosong!");
            }

            String nomorKamar = NomorKamar.getText().trim();
            int kapasitas = Kapasitas.getValue();
            int sisaTempat = SisaTempat.getValue();
            char tipeKamar = TipeKamar.getValue(); 

            Kamar kamarBaru = new Kamar();
            kamarBaru.setNomor_kamar(nomorKamar);
            kamarBaru.setKapasitas(kapasitas);
            kamarBaru.setSisa_kamar(sisaTempat);
            kamarBaru.setTipe_kamar(tipeKamar);

            KamarDAO.save(kamarBaru);

            // Notifikasi sukses
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sukses");
            alert.setHeaderText(null);
            alert.setContentText("Data kamar berhasil disimpan!");
            alert.showAndWait();

            // Refresh table
            loadDataKamar();
            syncDataWithServer();
        } catch (IllegalArgumentException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Kesalahan");
            alert.setHeaderText(null);
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Kesalahan");
            alert.setHeaderText(null);
            alert.setContentText("Gagal menyimpan data: " + e.getMessage());
            alert.showAndWait();
        }
    }

    private void syncDataWithServer() {

        System.out.println("Sinkronisasi data dengan server...");

    }

    @FXML
    void handleTambahDataKamar(MouseEvent event) {
        // Reset form
        NomorKamar.clear();
        Kapasitas.getValueFactory().setValue(1);
        SisaTempat.getValueFactory().setValue(0);
        TipeKamar.getSelectionModel().clearSelection(); 

    }


    @FXML
    void handleUbahDataKamar(MouseEvent event) {
        Kamar kamarDipilih = TableDataKamar.getSelectionModel().getSelectedItem();
        if (kamarDipilih != null) {
            try {

                if (NomorKamar.getText() == null || NomorKamar.getText().trim().isEmpty()) {
                    throw new IllegalArgumentException("Nomor kamar tidak boleh kosong!");
                }
                if (TipeKamar.getValue() == null) {
                    throw new IllegalArgumentException("Tipe kamar tidak boleh kosong!");
                }

                // Update data
                kamarDipilih.setNomor_kamar(NomorKamar.getText());
                kamarDipilih.setKapasitas(Kapasitas.getValue());
                kamarDipilih.setSisa_kamar(SisaTempat.getValue());
                kamarDipilih.setTipe_kamar(TipeKamar.getValue()); 

                // Simpan perubahan ke database
                KamarDAO.save(kamarDipilih);
                loadDataKamar();
                syncDataWithServer(); 

                // Notifikasi sukses
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Sukses");
                alert.setHeaderText(null);
                alert.setContentText("Data kamar berhasil diubah!");
                alert.showAndWait();
            } catch (IllegalArgumentException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Kesalahan");
                alert.setHeaderText(null);
                alert.setContentText(e.getMessage());
                alert.showAndWait();
            } catch (PersistentException e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Ubah Data Kamar");
            alert.setHeaderText(null);
            alert.setContentText("Silakan pilih data kamar yang ingin diubah.");
            alert.showAndWait();
        }
    }
    
    @FXML
    void handleHapusDataKamar(MouseEvent event) {
        Kamar kamarDipilih = TableDataKamar.getSelectionModel().getSelectedItem();
        if (kamarDipilih != null) {
            try {
                // Hapus data dari database
                KamarDAO.delete(kamarDipilih);

                // Refresh tabel
                loadDataKamar();
                syncDataWithServer(); // Sinkronisasi ke server

                // Tampilkan pesan sukses
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Sukses");
                alert.setHeaderText(null);
                alert.setContentText("Data kamar berhasil dihapus!");
                alert.showAndWait();
            } catch (Exception e) {
                e.printStackTrace();
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Kesalahan");
                alert.setHeaderText(null);
                alert.setContentText("Gagal menghapus data kamar: " + e.getMessage());
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Hapus Data Kamar");
            alert.setHeaderText(null);
            alert.setContentText("Silakan pilih data kamar yang ingin dihapus.");
            alert.showAndWait();
        }
    }


}
