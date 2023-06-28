/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mxuan
 */
import jakarta.persistence.*;

import lombok.*;

import static jakarta.persistence.FetchType.*;

@Entity(name = "chi_tiet_gio_hang")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietGioHang {
    @EmbeddedId
    private ChiTietGioHangId id;

    @Column(name = "so_luong_san_pham")
    private int soLuongSanPham;

    @Column(name = "gia_ban_san_pham")
    private int giaBanSanPham;

    @Column(name = "tong_tien_san_pham")
    private int tongTienSanPham;

    @ManyToOne(fetch = LAZY)
    @MapsId("id_gio_hang")
    @JoinColumn(name = "id_gio_hang", referencedColumnName = "id", insertable = false, updatable = false)
    private GioHang gioHang;

    @ManyToOne(fetch = LAZY)
    @MapsId("id_san_pham")
    @JoinColumn(name = "id_san_pham", referencedColumnName = "id", insertable = false, updatable = false)
    private SanPham sanPham;
}
