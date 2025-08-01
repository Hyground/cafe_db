    package com.cafeumg.cdfs.entities;

    import jakarta.persistence.*;

    @Entity
    @Table(name = "typ")
    public class Typ {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id_type;

        private String type_name;

        public Typ() {}

        public Typ(Integer id_type, String type_name) {
            this.id_type = id_type;
            this.type_name = type_name;
        }

        public Integer getId_type() {
            return id_type;
        }

        public void setId_type(Integer id_type) {
            this.id_type = id_type;
        }

        public String getType_name() {
            return type_name;
        }

        public void setType_name(String type_name) {
            this.type_name = type_name;
        }
    }