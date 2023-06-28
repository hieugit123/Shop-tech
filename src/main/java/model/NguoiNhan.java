/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mxuan
 */
import java.util.*;

import jakarta.persistence.*;

import lombok.*;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;

@Entity(name = "nguoi_nhan")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class NguoiNhan {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private int id;

    @NonNull
    @Column(name = "ho_ten")
    private String hoTen;

    @NonNull
    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @NonNull
    @Column(name = "dia_chi")
    private String diaChi;

    @NonNull
    @Column(name = "xa_phuong")
    private String xaPhuong;

    @NonNull
    @Column(name = "huyen_quan")
    private String huyenQuan;

    @Column(name = "id_tinh_thanh")
    private int idTinhThanh;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_tinh_thanh", referencedColumnName = "id", insertable = false, updatable = false)
    private TinhThanh tinhThanh;

    @OneToMany(mappedBy = "nguoiNhan")
    private List<DonHang> dsDonHang;
}
