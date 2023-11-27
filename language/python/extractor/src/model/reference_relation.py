# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class ReferenceRelation(Base):
    __tablename__ = "reference_relation"

    reference_element_oid = Column(Integer, primary_key=True)
    definition_element_oid = Column(Integer, nullable=False)
