package enumtype.university;

public enum University {
    ÁTE("University of Veterinary Medicine"),BCE("Corvinus University"),BGE("Budapest Business School"),
    BME("Budapest University of Technology and Economics"),ELTE("Eötvös Loránd University"),LFZE("Franz Liszt Academy of Music"),
    MKE("Hungarian University of Fine Arts"),MTE("Hungarian Dance Academy"),MOME("Moholy-Nagy University of Art and Design"),
    NKE("National University of Public Service"),OE("Óbuda University"),SOTE("Semmelweis University"),
    SZFE("Academy of Drama and Film"),TE("University of Physical Education");

    public final String name;

    University(String name) {
        this.name = name;
    }
}
