export const BookComponent = ({id, title, publisher}: {id?: number, title: string, publisher: string}) => {
    return <div>
        <div>Book ID: ${id}</div>
        <div>Book Title: ${title}</div>
        <div>Book Publisher: ${publisher}</div>
    </div>
}