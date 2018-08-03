/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.time.LocalDate;
import static org.eclipse.core.internal.content.ContentMessages.message;
import streaming.entity.Journal;

/**
 *
 * @author Administrateur
 */
public class JournalServiceMockIpml implements JournalService{

    @Override
    public void log(String message) {
        System.out.println(message + LocalDate.now());
    }
}
