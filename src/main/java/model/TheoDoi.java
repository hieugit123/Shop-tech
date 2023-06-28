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

@Entity(name = "theo_doi")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class TheoDoi {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private int id;

    @NonNull
    @Column(name = "thu_dien_tu")
    private String email;
}
