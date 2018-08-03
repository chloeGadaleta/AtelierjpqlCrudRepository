/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.entity.Film;

/**
 *
 * @author Administrateur
 */

public interface FilmService {
    
    public Film findByTitre(String titre);
    public Film findById(long idFilm);
    public void update(Film f);
    public void insert(Film f);
    public Iterable<Film> list();
    public void removeAll();
}
