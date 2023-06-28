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

@Entity(name = "credit_card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name_on_card")
    private String nameOnCard;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "expiration")
    private String expiration;

    @Column(name = "security_code")
    private String securityCode;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    private KhachHang khachHang;
}

