package kg.easy.serverapp.mappers;

import java.util.List;

public interface BaseMapperMethods<S, T> {

    S toDto(T t);
    T toEntity(S s);

    List<S> toDtoList(List<T> t);
    List<T> toEntityList(List<S> s);


}
