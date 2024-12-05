/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package umy.tugas2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import umy.tugas2.model.Informasi;

@RestController
@CrossOrigin
public class InformasiController {
    @GetMapping("/informasi")
    public Informasi getInformasi() {
        return new Informasi("Abra Yudhistira R", "20220140102");
    }
}