export const ticketService = (() => {

    const getList = async (page, category, ratingType, sortType, callback) => {
        let uri = `/ticket/api/list?page=${page}&sortType=${sortType}`;

        if (category !== 'ALL') {
            uri += `&category=${category}`;
        }

        if (ratingType !== 'no') {
            uri += `&ratingType=${ratingType}`;
        }

        const response = await fetch(uri,
            {
                    method: "GET"
                }
        );
        
        const ticketsSlice = await response.json();

        if (callback) {
            return callback(ticketsSlice.content);
        }
    }

    return {
        getList: getList,
    }
})();