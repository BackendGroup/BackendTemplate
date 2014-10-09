/* ========================================================================
 * Copyright 2014 uniandes
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 uniandes

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201408112050

*/

package co.edu.uniandes.csw.uniandes.user.persistence.converter;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


import co.edu.uniandes.csw.uniandes.user.logic.dto.UserDTO;
import co.edu.uniandes.csw.uniandes.user.persistence.entity.UserEntity;


public abstract class _UserConverter {

 
	private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	public static UserDTO entity2PersistenceDTO(UserEntity entity){
		if (entity != null) {
			UserDTO dto = new UserDTO();
					dto.setId(entity.getId());
					dto.setUserName(entity.getUserName());
					dto.setEmail(entity.getEmail());
					dto.setPassword(entity.getPassword());

//				}	
			return dto;
		}else{
			return null;
		}
	}
	
	public static UserEntity persistenceDTO2Entity(UserDTO dto){
		if(dto!=null){
			UserEntity entity=new UserEntity();
					entity.setId(dto.getId());
			
					entity.setUserName(dto.getUserName());
			
					entity.setEmail(dto.getEmail());
			
					entity.setPassword(dto.getPassword());
			

			
			return entity;
		}else {
			return null;
		}
	}
	
	public static List<UserDTO> entity2PersistenceDTOList(List<UserEntity> entities){
		List<UserDTO> dtos=new ArrayList<UserDTO>();
		for(UserEntity entity:entities){
			dtos.add(entity2PersistenceDTO(entity));
		}
		return dtos;
	}
	
	public static List<UserEntity> persistenceDTO2EntityList(List<UserDTO> dtos){
		List<UserEntity> entities=new ArrayList<UserEntity>();
		for(UserDTO dto:dtos){
			entities.add(persistenceDTO2Entity(dto));
		}
		return entities;
	}
}