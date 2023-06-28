/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mxuan
 */
import java.io.*;

import jakarta.persistence.*;

import lombok.*;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietGioHangId implements Serializable {
    @Column(name = "id_gio_hang")
    private int idGioHang;

    @Column(name = "id_san_pham")
    private int idSanPham;
}

