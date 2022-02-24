Feature: Yo como usuario deseo ver la actualidad econimica de bancolombia

  @UsuarioMiraActulidadEconomica
    Scenario: Mirar reporte OPEP+
      Given el usuario entra a la pagina
      And selecciona Empresas
      And selecciona Capital Inteligente
      When da click en Actualidad economica
      And busca el reporte
      Then descarga el reporte
      And verifica la descarga