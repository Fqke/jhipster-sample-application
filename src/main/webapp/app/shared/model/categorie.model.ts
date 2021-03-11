import { IArticle } from 'app/shared/model/article.model';

export interface ICategorie {
  id?: number;
  nom?: string;
  prixEnEuros?: number;
  articles?: IArticle[];
}

export class Categorie implements ICategorie {
  constructor(public id?: number, public nom?: string, public prixEnEuros?: number, public articles?: IArticle[]) {}
}
