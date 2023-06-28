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

import static jakarta.persistence.GenerationType.*;
@Entity(name = "thu_phan_hoi")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ThuPhanHoi {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "ho_ten")
    private String hoTen;

    @NonNull
    @Column(name = "thu_dien_tu")
    private String email;

    @Column(name = "chu_de")
    private String chuDe;

    @Column(name = "noi_dung")
    private String noiDung;
}
