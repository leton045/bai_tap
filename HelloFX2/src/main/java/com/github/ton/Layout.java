package com.github.ton;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Hashtable;

public class Layout extends Application {

    private ObservableList<Product> products = FXCollections.observableArrayList();


    private GridPane createGidPane() {
        GridPane grid = new GridPane();


//      Auto resize
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(40);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(40);
        grid.getColumnConstraints().addAll(column1, column2);


        Label lbMaSanPham = new Label("Mã Sản phẩm : ");

        TextField txtMaSanPham = new TextField();
        txtMaSanPham.setPromptText("Vui lòng nhập mã sp");

        Label lbTenSanPham = new Label("Tên sản phẩm: ");
        TextField txtTenSanPham = new TextField();
        txtTenSanPham.setPromptText("Vui lòng nhập tên SP");

        Label lbGiaBan = new Label("Giá bán: ");
        TextField txtGiaBan = new TextField();
        txtGiaBan.setPromptText("Nhập giá ");

        Label lbGiaNhap = new Label("Giá nhập : ");
        TextField txtGiaNhap = new TextField();
        txtGiaNhap.setPromptText("Nhập gía Nhập ");

        Label lbSoLuongBan = new Label("Số lượng bán : ");
        TextField txtSoLuongBan = new TextField();
        txtSoLuongBan.setPromptText("Nhập số lượng bán ");

        Label lbSoLuongMua = new Label("Số lượng nhập : ");
        TextField txtSoLuongMua = new TextField();
        txtSoLuongMua.setPromptText("Nhập số lượng nhập");

        Label lbHang = new Label("Hãng : ");


        ObservableList<String> tenHang = FXCollections.observableArrayList("Nokia", "SamSung", "OPPO", "Iphone"
                , "Sony", "Bosse", "Dell ", "HP", "Macbook");
        ComboBox hang = new ComboBox(tenHang);


        Label lbDanhMuc = new Label("Danh mục : ");
        ObservableList<String> danhSachSP = FXCollections.observableArrayList("Dien thoai",
                "Laptop", "Apple", "Phu kien");
        ComboBox danhMuc = new ComboBox(danhSachSP);

        Button themSP = new Button("Thêm SP");


        TextField timKiemNhanh = new TextField();
        timKiemNhanh.setPromptText("Nhập SP cần tìm kiếm");
        Button timKiem = new Button("Tìm nhanh ");


        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setAlignment(Pos.BASELINE_LEFT);

        grid.add(lbMaSanPham, 0, 0);
        grid.add(txtMaSanPham, 1, 0);

        grid.add(lbTenSanPham, 0, 1);
        grid.add(txtTenSanPham, 1, 1);

        grid.add(lbGiaBan, 0, 2);
        grid.add(txtGiaBan, 1, 2);

        grid.add(lbGiaNhap, 0, 3);
        grid.add(txtGiaNhap, 1, 3);

        grid.add(lbSoLuongBan, 0, 4);
        grid.add(txtSoLuongBan, 1, 4);

        grid.add(lbSoLuongMua, 0, 5);
        grid.add(txtSoLuongMua, 1, 5);

        grid.add(lbHang, 0, 6);
        grid.add(hang, 1, 6);

        grid.add(lbDanhMuc, 0, 7);
        grid.add(danhMuc, 1, 7);

        grid.add(themSP, 0, 9);

        grid.add(timKiemNhanh, 0, 10);
        grid.add(timKiem, 0, 11);


        lbMaSanPham.setStyle("-fx-font: normal bold 13px 'serif'");
        lbTenSanPham.setStyle("-fx-font: normal bold 13px 'serif'");
        lbGiaBan.setStyle("-fx-font: normal bold 13px 'serif'");
        lbGiaNhap.setStyle("-fx-font: normal bold 13px 'serif'");
        lbSoLuongBan.setStyle("-fx-font: normal bold 13px 'serif'");
        lbGiaNhap.setStyle("-fx-font: normal bold 13px 'serif'");
        lbHang.setStyle("-fx-font: normal bold 13px 'serif'");
        lbDanhMuc.setStyle("-fx-font: normal bold 13px 'serif'");
        themSP.setStyle("-fx-font: normal bold 13px 'serif'");
        timKiem.setStyle("-fx-font: normal bold 13px 'serif'");



        themSP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Product product = new Product();
                product.setMaSP(Integer.parseInt(txtMaSanPham.getText()));
                product.setTenSP(txtTenSanPham.getText());
                product.setGiaBan(Double.parseDouble(txtGiaBan.getText()));
                product.setHang((String)hang.getValue());
                product.setDanhMuc((String)danhMuc.getValue());

                products.add(product);
            }
        });

        return grid;
    }

    private TableView createProductTable() {
        TableView<Product> tableView = new TableView<>();
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        //colums

        TableColumn tableColumn = new TableColumn("Mã SP");
        TableColumn tableColumn1 = new TableColumn("Tên SP");
        TableColumn tableColumn2 = new TableColumn("Giá Bán");
        TableColumn tableColumn3 = new TableColumn("Giá Nhập");
        TableColumn tableColumn4 = new TableColumn("Số lượng Nhập");
        TableColumn tableColumn5 = new TableColumn("Số lương xuất");
        TableColumn tableColumn6 = new TableColumn("Hãng");
        TableColumn tableColumn7 = new TableColumn("Danh mục");

        tableColumn.setMinWidth(50);
        tableColumn.setCellValueFactory(new PropertyValueFactory<>("tenSP"));

        tableColumn1.setMinWidth(100);
        tableColumn1.setCellValueFactory(new PropertyValueFactory<>("maSP"));

        tableColumn2.setMinWidth(100);
        tableColumn2.setCellValueFactory(new PropertyValueFactory<>("giaBan"));

        tableColumn3.setMinWidth(100);
        tableColumn3.setCellValueFactory(new PropertyValueFactory<>("giaNhap"));

        tableColumn4.setMinWidth(100);
        tableColumn4.setCellValueFactory(new PropertyValueFactory<>("soLuongNhap"));

        tableColumn5.setMinWidth(100);
        tableColumn5.setCellValueFactory(new PropertyValueFactory<>("soLuongBan"));

        tableColumn6.setMinWidth(100);
        tableColumn6.setCellValueFactory(new PropertyValueFactory<>("hang"));

        tableColumn7.setMinWidth(100);
        tableColumn7.setCellValueFactory(new PropertyValueFactory<>("danhMuc"));
        tableView.setItems(products);
        tableView.getColumns().addAll(tableColumn, tableColumn1, tableColumn2, tableColumn3, tableColumn4, tableColumn5
                , tableColumn6, tableColumn7);
        return tableView;
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ScrollPane scrollPane = new ScrollPane();
        TableView tableView = createProductTable();
        scrollPane.setContent(tableView);
        scrollPane.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);


        GridPane grid = createGidPane();

        VBox vBox = new VBox();
        vBox.getChildren().add(grid);
        vBox.getChildren().add(scrollPane);


        Scene scene = new Scene(vBox, 500, 500);
        primaryStage.setTitle("Quan ly SP");
        primaryStage.setScene(scene);

        primaryStage.show();


    }

}
