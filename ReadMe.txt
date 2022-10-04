# 220929 plant hotel greenest

# ReadMe demo
Först: Demonstration av att programmet fungerar enligt kravspec.
- test
- "blank"
- avbryt/stäng ruta för att stänga programmet
- Igge
- Laura
- Meatloaf
- Putte

- Demo av MainTest

Muntligt:
Main startar upp instanser av PlantList och UI.

Plantlists håller endast en Arraylist av plantorna,
men jag valde att lägga den i en egen klass för överblickens skull.
Här kan man se exempel på Polymorfism.

UI tar input genom JOptionpane och slår denna i PlantList.
När den hittar ett matchande namn i listan aktiverar den Plant.printInstruction,
som går genom interface:t GetFeedingInstruction.

Plant är den abstrakta superklassen som växttyperna ärver av.
Här finns även ett exempel av inkapsling.

Liquid: Här ligger typer av växtvätska som enums.

Inkapsling kan vi även se i klasserna Palmtree, Cactus, och Carnivorous.

