select * from RichiestaAmicizia;
select * from Utente;
drop table RichiestaAmicizia;

CREATE TABLE RichiestaAmicizia(
    
	   
    	UtenteRichiedente varchar(50) NOT NULL,
    	UtenteRicevente varchar(50) NOT NULL,
    	StatoRichiesta integer(1) NOT NULL,
	    PRIMARY KEY (UtenteRichiedente,UtenteRicevente),
    	FOREIGN KEY (UtenteRichiedente) REFERENCES Utente(IdUtente),
	    FOREIGN KEY (UtenteRicevente) REFERENCES Utente(IdUtente)

);
