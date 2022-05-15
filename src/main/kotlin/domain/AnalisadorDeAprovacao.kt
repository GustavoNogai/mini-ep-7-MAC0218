package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

    private lateinit var critAprov: CriterioDeAprovacao

    fun defineCriterio(criterio : CriterioDeAprovacao){

        critAprov = criterio

    }

    fun fechaBoletim(boletim : Boletim) : BoletimFechado{

        val aprov = critAprov.estaAprovado(boletim)
        val mediaF = critAprov.mediaFinal(boletim)

        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, mediaF, aprov)

    }

}