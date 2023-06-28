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

@Entity(name = "gio_hang")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GioHang {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "tong_so_luong")
    private int tongSoLuong;

    @Column(name = "giam_gia")
    private int giamGia;

    @Column(name = "tong_gio_hang")
    private int tongGioHang;

    @Column(name = "huyen_quan")
    private String huyenQuan;

    @Column(name = "id_tinh_thanh")
    private int idTinhThanh;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_tinh_thanh", referencedColumnName = "id", insertable = false, updatable = false)
    private TinhThanh tinhThanh;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    private KhachHang khachHang;

    @OneToMany(mappedBy = "gioHang")
    private List<ChiTietGioHang> dsChiTietGioHang;
}

