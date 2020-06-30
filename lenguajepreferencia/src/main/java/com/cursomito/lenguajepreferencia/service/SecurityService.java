package com.cursomito.lenguajepreferencia.service;

import com.cursomito.lenguajepreferencia.entity.RenewPasswordFirstDTO;
import com.cursomito.lenguajepreferencia.entity.RespuestaApi;
import com.cursomito.lenguajepreferencia.entity.UpdatePasswordDTO;

public interface SecurityService {

	public RespuestaApi getToken(String username, String password);
	public RespuestaApi resetNewPasswordFirst(RenewPasswordFirstDTO updatePassword);
	public RespuestaApi updatePassword(UpdatePasswordDTO updatePassword);
	public RespuestaApi signOut(String token);
	public RespuestaApi refreshToken(String token);
}
