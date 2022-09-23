package com.educacionit.clase11y12.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banco extends Institucion {

    private String sucursal;
    private List<Long> cuentas;

    private Long contadorCbu = 1L;

    public Banco(String direccion, int superficie, // institución
                 String sucursal, List<Long> cuentas) {
        super(direccion, superficie);
        this.sucursal = sucursal;
        this.cuentas = cuentas;
    }

    public Banco(String direccion, int superficie, // institución
                 String sucursal) {
        super.direccion = direccion;
        super.superficie = superficie;
        this.sucursal = sucursal;
        this.cuentas = new ArrayList<>();
    }

    public Banco() {
        this("", 0, "", new ArrayList<>());
        /*
        super.direccion = "";
        super.superficie = 0;
        this.sucursal = "";
        this.cuentas = new ArrayList<>();
        */
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public List<Long> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Long> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public void pagasImpuestos() {
        // todo implementar este método
    }

    /**
     * Da de alta una cuenta de banco
     *
     * @return el número de cuenta en {@link Long}
     */
    public Long altaCuenta() {
        Long cbu = contadorCbu++;
        this.cuentas.add(cbu);
        return cbu;
    }

    /**
     * Elimina una cuenta del banco
     *
     * @param cbu número de cuenta en {@link Long}
     * @return true si se eliminó o false si no existe
     */
    public boolean bajaCuenta(Long cbu) {
        boolean exists = this.cuentas.contains(cbu);
        if (exists) {
            this.cuentas.remove(cbu);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Banco banco = (Banco) o;
        return Objects.equals(sucursal, banco.sucursal) && Objects.equals(cuentas, banco.cuentas) && Objects.equals(contadorCbu, banco.contadorCbu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sucursal, cuentas, contadorCbu);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "sucursal='" + sucursal + '\'' +
                ", cuentas=" + cuentas +
                ", contadoCbu=" + contadorCbu +
                ", direccion='" + direccion + '\'' +
                ", superficie=" + superficie +
                '}';
    }
}
