package br.com.javadeveloper.dto;

import br.com.javadeveloper.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
