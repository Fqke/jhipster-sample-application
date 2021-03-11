import { ICategorie } from 'app/shared/model/categorie.model';

export interface IArticle {
  id?: number;
  designation?: string;
  stock?: number;
  nbPoints?: number;
  description?: string;
  categorie?: ICategorie;
}

export class Article implements IArticle {
  constructor(
    public id?: number,
    public designation?: string,
    public stock?: number,
    public nbPoints?: number,
    public description?: string,
    public categorie?: ICategorie
  ) {}
}
