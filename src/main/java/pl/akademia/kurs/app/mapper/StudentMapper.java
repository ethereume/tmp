package pl.akademia.kurs.app.mapper;

public interface StudentMapper<F,T> {
    T map(F from);
}
