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
public class ChiTietDonHangId implements Serializable {
    @Column(name = "id_don_hang")
    private int idDonHang;

    @Column(name = "id_san_pham")
    private int idSanPham;
}

