package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieListMapper implements Converter<List<MovieDto>, List<Movie>> {

    @Override
    public List<MovieDto> convert(List<Movie> movies) {
        List<MovieDto> moviesDto = movies.stream().map(x->new MovieDto.Builder()
            .title(x.getTitle())
            .image(x.getImage())
            .year(x.getYear())
            .build()).collect(Collectors.toList());





        return moviesDto;
    }
}
