import { Author } from "./Author"

export interface Book {
    id?: number,
    title: string,
    publisher: string
    author: Author
}

export interface Book {
    getBooks: Book[]
}