package com.senai.aula01_classe_atributo_metodos.guns;

import java.util.Objects;

public class Guns {

 String name; //Nome da arma
 String type;//Tipo de arma
 String caliber;// Calibre da arma
 int magazineCapacity;// Capacidade do carregador
 float range;//Alcance efetivo da arma
 float weight;//Peso da arma em quilogramas
 String material;//Material principal
 String manuFacturer;//Fabricante ou marca

 public Guns(String name, String type, String caliber, int magazineCapacity, float range, float weight, String material, String manuFacturer) {
  this.name = name;
  this.type = type;
  this.caliber = caliber;
  this.magazineCapacity = magazineCapacity;
  this.range = range;
  this.weight = weight;
  this.material = material;
  this.manuFacturer = manuFacturer;
 }

 @Override
 public String toString() {
  return "guns{" +
          "name='" + name + '\'' +
          ", type='" + type + '\'' +
          ", caliber='" + caliber + '\'' +
          ", magazineCapacity=" + magazineCapacity +
          ", range=" + range +
          ", weight=" + weight +
          ", material='" + material + '\'' +
          ", manuFacturer='" + manuFacturer + '\'' +
          '}';
 }

 @Override
 public boolean equals(Object o) {
  if (o == null || getClass() != o.getClass()) return false;
  Guns guns = (Guns) o;
  return magazineCapacity == guns.magazineCapacity && Float.compare(range, guns.range) == 0 && Float.compare(weight, guns.weight) == 0 && Objects.equals(name, guns.name) && Objects.equals(type, guns.type) && Objects.equals(caliber, guns.caliber) && Objects.equals(material, guns.material) && Objects.equals(manuFacturer, guns.manuFacturer);
 }

 @Override
 public int hashCode() {
  return Objects.hash(name, type, caliber, magazineCapacity, range, weight, material, manuFacturer);
 }
}
