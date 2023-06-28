/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

import jakarta.persistence.*;

import lombok.*;

import static jakarta.persistence.GenerationType.*;

@Entity(name = "tinh_thanh")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class TinhThanh {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private int id;

    @NonNull
    @Column(name = "ten")
    private String ten;

    @Column(name = "chi_phi_van_chuyen")
    private int chiPhiVanChuyen;

    @OneToMany(mappedBy = "tinhThanh")
    private List<KhachHang> dsKhachHang;

    @OneToMany(mappedBy = "tinhThanh")
    private List<NguoiNhan> dsNguoiNhan;

    @OneToMany(mappedBy = "tinhThanh")
    private List<GioHang> dsGioHang;
}

